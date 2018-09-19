var isIE = /*@cc_on!@*/false || !!document.documentMode;
var expandable = document.querySelectorAll('#expand_button');
var count = 0;

if(isIE) {
	alert('This website doens\'t funtion properly on Internet Explorer. Please use a differennt browser');
}

for (let i = 0; i < expandable.length; i++) {
	
	expandable[i].addEventListener('click', function () {
		
		var content_item = document.querySelectorAll('#content_item');
		var content_item_details = document.querySelectorAll('#long_description');
		var content_expand_handle = document.querySelectorAll('#expand_button');
		
		console.log(i);
		
		if(count%2 !== 0) {
			content_item[i].style.height = '';
			content_item_details[i].style.visibility = 'hidden';
			content_item_details[i].style.opacity = '0';
			content_item_details[i].style.lineHeight = '0em';
			content_expand_handle[i].innerText = '+';
		} else {
			content_item[i].style.height = '300px';
			content_item_details[i].style.visibility = 'visible';
			content_item_details[i].style.opacity = '1';
			content_item_details[i].style.lineHeight = '1.5em';
			content_expand_handle[i].innerText = '-';
		}
		
		count++;
		console.log(count);
	});

}