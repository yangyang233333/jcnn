import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Model {
    JSON json;

    Model(String jsonPath) {
        this.json = new JSONObject();
    }

    Dense fc1 = new Dense(728, 512);
    Dense fc2 = new Dense(512, 10);

    public void exec() {
        double[] x = {1, 2, 3};
        for (int i = 0; i < 2; ++i) {
            var x1 = fc1.forward(x);
            var x2 = fc1.forward(x1);
        }
    }
}
