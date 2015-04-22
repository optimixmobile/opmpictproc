var pictprocess = {
	test01: function(parm1, parm2, parm3, parm4, parm5, successCallback, errorCallback) {
		cordova.exec(
			successCallback, 	// success callback function
			errorCallback, 		// error callback function
			'opmpictproc', 		// mapped Java class called "pictprocess"
			'test01',   		// with this action name
			[
				{ // and this array of custom arguments to create our entry
					"parm1": parm1,
					"parm2": parm2,
					"parm3": parm3,
					"parm4": parm4,
					"parm5": parm5
				}
			]
		);
	}
}
