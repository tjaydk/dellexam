

//Submitbutton enabled by checked 'read terms of condition'

EnableSubmit = function (val)
{
    var sbmt = document.getElementById("Accept");

    if (val.checked == true)
    {
        sbmt.disabled = false;
    }
    else
    {
        sbmt.disabled = true;
    }
};

//Countdown function

function countdown() {
    var i = document.getElementById('counter');
    if (parseInt(i.innerHTML) <= 1) {
        location.href = 'dashboard.jsp';
    }
    i.innerHTML = parseInt(i.innerHTML) - 1;
}
setInterval(function () {
    countdown();
}, 1000);

//Dropdown funcion for login

$(document).ready(function () {
    //Handles menu drop down
    $('.dropdown-menu').find('form').click(function (e) {
        e.stopPropagation();
    });
});

