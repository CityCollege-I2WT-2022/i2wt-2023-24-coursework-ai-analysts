// Add event listeners for each logo rectangle
document.getElementById('logo1').addEventListener('mouseover', function() {
    showText('Your Text for Logo 1');
});

document.getElementById('logo2').addEventListener('mouseover', function() {
    showText('Your Text for Logo 2');
});

document.getElementById('logo3').addEventListener('mouseover', function() {
    showText('Your Text for Logo 3');
});

document.getElementById('logo4').addEventListener('mouseover', function() {
    showText('Your Text for Logo 4');
});

document.getElementById('logo5').addEventListener('mouseover', function() {
    showText('Your Text for Logo 5');
});

// Function to show text for a specific logo
function showText(text) {
    alert(text); // You can replace this with your desired action or UI update
}
