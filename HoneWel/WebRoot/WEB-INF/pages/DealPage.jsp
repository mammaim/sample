<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="jquery-3.3.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
function acceptDeal(){
	        var deal = [];
	        $(':checkbox:checked').each(function(i){
	        	if(i>1){
	          deal[dealId] = $(this).val();
	        	}else{
	        		alert("Your not allow to deal with morethan one item");
	        	}
	        });
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "${home}/accept/api/getAccept",
		data : JSON.stringify(deal),
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
	
	function display(data) {
		var json = "<pre>"
				+ JSON.stringify(data, null, 4) + "</pre>";
		$('#acceptedDeals').html(json);
	}
}
</script>
</head>
<body>
<form action=/deal.htm>
  Deal item:<br>
  <input type="text" name="deal" value="" id="deal">
  <input type="submit" value="Submit">
  <input type="submit" value="Accept" id="acceptId" onclick="acceptDeal();">
  <div id="acceptedDeals"></div>
<div id="displayDealsId">
<c:if test="${not empty dealList}">
		<ul>
			<c:forEach var="listValue" items="${dealList}">
			<input type="checkbox" name="deal" value="${listValue}"> ${listValue} <br>
			</c:forEach>
		</ul>
	</c:if>
	</div>
	</form>
</body>
</html>