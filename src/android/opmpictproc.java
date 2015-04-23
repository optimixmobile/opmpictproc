package org.optimix.opmpictproc;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class opmpictproc extends CordovaPlugin {
	public static final String ACTION_TEST01 = "test01";
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
		/*
			if (ACTION_TEST01.equals(action)) {
				JSONObject arg_object = args.getJSONObject(0);
				// arg_object.getString("parm1") ou arg_object.getLong("description")


				callbackContext.success(arg_object.getString("parm1"));
				return true;
			}
			callbackContext.error("Invalid action");
			return false;
		*/
			JSONObject arg_object = args.getJSONObject(0);
			// callbackContext.success(arg_object.getString("parm1"));
			callbackContext.success("Test Bertrand");
			return true;
		} catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}
