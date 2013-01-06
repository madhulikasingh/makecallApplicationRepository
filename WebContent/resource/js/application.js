
function validate(){
	var isValid = false;
	var from = document.getElementById('from').value;
	var to = document.getElementById('to').value;
	var url = document.getElementById('url').value;
	var numberRegEx = /^\d*$/;
	var urlRegEx = /^[0-9a-zA-Z~`!@#$%^&*()\-_\+=\[\]|;:"'<>,\.\/\?\s]*$/;
	if(from == null || from == ''){
		alert('Please enter any value for From field.');
		return false;
	}
	else if(!numberRegEx.test(from)){
		alert('Please enter any positive number value for From field.');
		return false;
	}
	else{
		isValid = true;
	}
	
	if(to == null || to == ''){
		alert('Please enter any value for To field.');
		return false;
	}
	else if(!numberRegEx.test(to)){
		alert('Please enter any positive number value for To field.');
		return false;
	}
	else{
		isValid = true;
	}
	
	if(url == null || url == ''){
		alert('Please enter any value for URL field.');
		return false;
	}
	else if(!urlRegEx.test(to)){
		alert('Please enter valid URL');
		return false;
	}
	else{
		isValid = true;
	}
	
	return isValid;
}

