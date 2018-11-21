package cordova-plugin-myplugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MyPlug extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callbackContext) {

        if (args != nil){

            try
            {
                int val = 10;
                callbackContext.success("Android- You called add function");
            }
            catch(exception e){
                callbackContext.error("Expected one non-empty string argument.");
            }
             
        }
        else{
            callbackContext.error("Expected one non-empty string argument.");
        }

    }
}
