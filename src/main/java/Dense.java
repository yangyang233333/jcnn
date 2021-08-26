
import java.util.Arrays;

public class Dense implements Layer {
    /*
    * 全连接层
    * */
    private final int in;//输入神经元数量
    private final int out;//输出神经元数量
    private double[][] weights;//权重
    private double[] bias;//偏置

    Dense(int in, int out) {
        this.in = in;
        this.out = out;
        weights = new double[out][in];
        bias = new double[out];
    }

    //forward
    public double[] forward(double[] x) {
        double[] ret = new double[this.out];//返回值
        for (int i = 0; i < this.out; ++i) {
            //计算ret[i] = x*weights[i]+bias[i]
            double temp = 0;//保存x*weights[i]的结果
            for (int j = 0; j < this.in; ++j) {
                temp += x[j] * weights[i][j];
            }
            ret[i] = temp + bias[i];
        }
        return ret;
    }

    //加载weights、bias
    @Override
    public void loadParas() {

    }

    //输出本层参数，做debug用
    @Override
    public String toString() {
        return "Dense{" +
                "in=" + in +
                ", out=" + out +
                ", weights=" + Arrays.toString(weights) +
                ", bias=" + Arrays.toString(bias) +
                '}';
    }
}
