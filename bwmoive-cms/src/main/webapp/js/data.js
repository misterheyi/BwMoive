$(function() {
    var description = UE.getEditor('container', {
   	 initialFrameHeight : 310,
   	enableAutoSave:false
    });
    
    //初始化频道
    $('#cId').combobox({
        url: basePath + '/channel/selectChannel',
        valueField:'cId',
        textField:'cName',
        required:true,
        editable:true,//不可编辑，只能选择
        onSelect: function(channel){
            $('#tId').combobox({
                url: basePath + '/type/selectType?cId='+channel.cId,
                required:true,
                editable:true,//不可编辑，只能选择
                valueField:'tId',
                textField:'tName'
            }).combobox('clear');
            $('#aId').combobox({
                url: basePath + '/area/selectArea?cId='+channel.cId,
                required:true,
                editable:true,//不可编辑，只能选择
                valueField:'aId',
                textField:'aName'
            }).combobox('clear');
        }
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
    			$("#vPic").textbox('setValue', data);
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
				"cId" : $('#cId').combobox('getValue').toString(),
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
				window.location.reload();
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
				$("#vName").textbox('setValue', baseInfos.vName);
				$("#vSpell").textbox('setValue',baseInfos.vSpell);
				$("#vLetter").textbox('setValue',baseInfos.vLetter);
				$("#vNickName").textbox('setValue',baseInfos.vNickName);
				$("#vEnName").textbox('setValue',baseInfos.vEnName);
				$("#vNickName").textbox('setValue',baseInfos.vNickName);
				$("#vPublishYear").textbox('setValue',baseInfos.vPublishYear);
				$("#vPublishCompany").textbox('setValue',baseInfos.vPublishCompany);
				$("#vShowBox").textbox('setValue',baseInfos.vShowBox);
				$("#vPublishArea").textbox('setValue',baseInfos.vPublishArea);
				$("#vVideoArea").textbox('setValue',baseInfos.vVideoArea);
				$("#vOnTime").textbox('setValue',baseInfos.vOnTime);
				$("#vOffTime").textbox('setValue',baseInfos.vOffTime);
				$("#vDirector").textbox('setValue',baseInfos.vDirector);
				$("#vWriter").textbox('setValue',baseInfos.vWriter);
				$("#vProducer").textbox('setValue',baseInfos.vProducer);
				$("#vType").textbox('setValue',baseInfos.vType);
				$("#vActor").textbox('setValue',baseInfos.vActor);
				$("#vTotal").textbox('setValue',baseInfos.vTotal);
				$("#vLength").textbox('setValue',baseInfos.vLength);
				$("#vBoxOffice").textbox('setValue',baseInfos.vBoxOffice);
				$("#vLanguage").textbox('setValue',baseInfos.vLanguage);
				$("#vColor").textbox('setValue',baseInfos.vColor);
				$("#vImdb").textbox('setValue',baseInfos.vImdb);
				$("#vPerLength").textbox('setValue',baseInfos.vPerLength);
				$("#vPresenter").textbox('setValue',baseInfos.vPresenter);
				$("#vOnlineShow").textbox('setValue',baseInfos.vOnlineShow);
				$("#vTvShow").textbox('setValue',baseInfos.vTvShow);
				
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


