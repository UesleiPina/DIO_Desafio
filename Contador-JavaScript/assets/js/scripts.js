let count = 0;
const CURRENT_NUMBER = document.getElementById('currentNumber');

function increment() {
    CURRENT_NUMBER.innerHTML = ++count;
    slyleColor()
}

function decrement() {
    CURRENT_NUMBER.innerHTML = --count;
    slyleColor()
}

function slyleColor(){
    if(count > 0)
        CURRENT_NUMBER.style.color = 'blue';
    if(count < 0)
        CURRENT_NUMBER.style.color = 'red';
    if(count === 0)
        CURRENT_NUMBER.style.color = 'white';
}
