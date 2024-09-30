function solve(num)
{
    var val1 = document.getElementById('res');
    val1.value += num;
}
function back()
{
    var ev = document.getElementById('res');
    ev.value = ev.value.slice(0,-1);
}
function clear()
{
    var imp = document.getElementById('res');
    imp.value = '';
}