package org.optimix.opmpictproc;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class pictprocess extends CordovaPlugin {
	public static final String ACTION_TEST01 = "test01";
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
		/*
			if (action.equals("test01")) {
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
			Intent intent = new Intent(Intent.ACTION_VIEW);
			cordova.getActivity().startActivity(intent);
			callbackContext.success("Test Bertrand");
			return true;
		} catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
			callbackContext.error(e.getMessage());
			return false;
		}
	}
}
