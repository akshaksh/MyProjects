// Set the date we're counting down to
var countDownDate = new Date();
countDownDate.setHours(00);
countDownDate.setMinutes(00);
countDownDate.setSeconds(00);
var second=0;var hour=0;var minute=0;
// Update the count down every 1 second
var x = setInterval(function() {
	second++;
    countDownDate.setSeconds(second);
    if(countDownDate.getSeconds() == 59){
    	minute++;
        second=0;
        countDownDate.setSeconds(00);
		countDownDate.setMinutes(minute);
        if(countDownDate.getMinutes()==59){
        	hour++;
            minute=0;
            countDownDate.setMinutes(00);
        }
        countDownDate.setHours(hour);
    }
    
	// Output the result in an element with id="demo"
    document.getElementById("demo").innerHTML = countDownDate.getHours() + "h "
    + countDownDate.getMinutes() + "m " + countDownDate.getSeconds() + "s ";
    
}, 1000);