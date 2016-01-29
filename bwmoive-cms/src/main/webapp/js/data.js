$(function() {
    var description = UE.getEditor('container', {
   	 initialFrameHeight : 310
    });
    
    $('#vCycle').combobox({
        data:[{
            "id":1,
            "text":"星期一"
        },{
            "id":2,
            "text":"星期二"
        },{
            "id":3,
            "text":"星期三"
        },{
            "id":4,
            "text":"星期四"
        },{
            "id":5,
            "text":"星期五"
        },{
            "id":6,
            "text":"星期六"
        },{
            "id":7,
            "text":"星期日"
        }],
		valueField:'id',
		textField:'text',
		multiple:true,
		panelHeight:'auto'
    });
    
    $("#loadImageBtn").click(function(){
    	$.ajax({
    		url : basePath + '/common/loadImage',
    		data : {
    			"url" : $("#vPicPath").val()
    		},
    		dataType : "text",
    		type : "POST",
    		success : function(data, textStatus) {
    			$("#vPic").val(data);
    		},
    		error : function(XMLHttpRequest, textStatus, errorThrown) {
    			alert("失败");
    			console.log(XMLHttpRequest.status);// 200客户端请求已成功
    			console.log(XMLHttpRequest.readyState);// 4响应内容解析完成，可以在客户端调用了
    			console.log(textStatus);// parsererror
    		}
    	});
    });
    
	//保存数据
	$("#saveDataBtn").click(function(){
		$.ajax({
			url : basePath + '/data/saveBasicInfo',
			data : {
				"vPic" : $("#vPic").val(),
				"tId" : $('#tId').combobox('getValue').toString(),
				"aId" : $('#aId').combobox('getValue').toString(),
				"vYear" : $("#vYear").val(),
				"vNote" : $("#vNote").val(),
				"vTags" : $("#vTags").val(),
				"vIsUnion" : $("#vIsUnion").val(),
				"vCycle" : $('#vCycle').combobox('getValues').toString(),
				"vVer" : $("#vVer").val(),
				"vRemark" : $("#vRemark").val(),
				"vScore" : $("#vScore").val(),
				"vDoubanScore" : $("#vDoubanScore").val(),
				"vmTimeScore" : $("#vmTimeScore").val(),
				"vImdbScore" : $("#vImdbScore").val(),
				"vMeituanScore" : $("#vMeituanScore").val(),
				"vName" : $("#vName").val(),
				"vSpell" : $("#vSpell").val(),
				"vLetter" : $("#vLetter").val(),
				"vNickName" : $("#vNickName").val(),
				"vEnName" : $("#vEnName").val(),
				"vPublishYear" : $("#vPublishYear").val(),
				"vPublishCompany" : $("#vPublishCompany").val(),
				"vShowBox" : $("#vShowBox").val(),
				"vPublishArea" : $("#vPublishArea").val(),
				"vVideoArea" : $("#vVideoArea").val(),
				"vVideoTime" : $("#vVideoTime").val(),
				"vOnTime" : $("#vOnTime").val(),
				"vOffTime" : $("#vOffTime").val(),
				"vDirector" : $("#vDirector").val(),
				"vWriter" : $("#vWriter").val(),
				"vProducer" : $("#vProducer").val(),
				"vType" : $("#vType").val(),
				"vActor" : $("#vActor").val(),
				"vTotal" : $("#vTotal").val(),
				"vTotal" : $("#vTotal").val(),
				"vLength" : $("#vLength").val(),
				"vBoxOffice" : $("#vBoxOffice").val(),
				"vLanguage" : $("#vLanguage").val(),
				"vColor" : $("#vColor").val(),
				"vImdb" : $("#vImdb").val(),
				"vPerLength" : $("#vPerLength").val(),
				"vPresenter" : $("#vPresenter").val(),
				"vOnlineShow" : $("#vOnlineShow").val(),
				"vTvShow" : $("#vTvShow").val(),
				"vDrama" : $("#vDrama").val(),
				"vDescription" : description.getContent(),
				"vSource" : $("#loadDataText").val()
			},
			type : "POST",
			cache : false,  
			dataType : "json",
			beforeSend : function(){
			},
			success : function(data, textStatus) {
				
			},
		    complete: function () {
		    },
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("异常"+errorThrown);
			}
		});
	});
	
	
	//抓取数据
	$("#loadDataBtn").click(function(){
		$.ajax({
			url : basePath + '/data/loadingData',
			data : {
				"source" : $("#loadDataText").val()
			},
			type : "POST",
			cache : false,  
			dataType : "json",
			beforeSend : function(){
			},
			success : function(data, textStatus) {
				var baseInfos = data.baseInfos;
				$("#vName").val(baseInfos.vName);
				$("#vSpell").val(baseInfos.vSpell);
				$("#vLetter").val(baseInfos.vLetter);
				$("#vNickName").val(baseInfos.vNickName);
				$("#vEnName").val(baseInfos.vEnName);
				$("#vPublishYear").val(baseInfos.vPublishYear);
				$("#vPublishCompany").val(baseInfos.vPublishCompany);
				$("#vShowBox").val(baseInfos.vShowBox);
				$("#vPublishArea").val(baseInfos.vPublishArea);
				$("#vVideoArea").val(baseInfos.vVideoArea);
				$("#vOnTime").val(baseInfos.vOnTime);
				$("#vOffTime").val(baseInfos.vOffTime);
				$("#vDirector").val(baseInfos.vDirector);
				$("#vWriter").val(baseInfos.vWriter);
				$("#vProducer").val(baseInfos.vProducer);
				$("#vType").val(baseInfos.vType);
				$("#vActor").val(baseInfos.vActor);
				$("#vTotal").val(baseInfos.vTotal);
				$("#vLength").val(baseInfos.vLength);
				$("#vBoxOffice").val(baseInfos.vBoxOffice);
				$("#vLanguage").val(baseInfos.vLanguage);
				$("#vColor").val(baseInfos.vColor);
				$("#vImdb").val(baseInfos.vImdb);
				$("#vPerLength").val(baseInfos.vPerLength);
				$("#vPresenter").val(baseInfos.vPresenter);
				$("#vOnlineShow").val(baseInfos.vOnlineShow);
				$("#vTvShow").val(baseInfos.vTvShow);
				
				$("#vDrama").val(data.vDrama);
			},
		    complete: function () {
		    },
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				console.log("获取链接异常"+errorThrown);
			}
		});
	});
	
});


