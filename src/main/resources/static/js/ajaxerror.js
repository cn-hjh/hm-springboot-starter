$.ajax({
    	url: "/err/getAjaxerror",
    	type: "POST",
    	async: false,
    	success: function(data) {
    		console.log("进入ajaxerror.js");
    		debugger;
            if(data.status == 200 && data.msg == "OK") {
            	console.log("成功");
            	alert("success");
            } else {
            	console.log("发生异常");
            	alert("发生异常：" + data.msg);
            }
    	},
        error: function (response, ajaxOptions, thrownError) {
        	console.log("error");
        	console.log(response);
        	console.log(ajaxOptions);
        	console.log(thrownError);
        	debugger;
        	alert("error");       
        }
    });