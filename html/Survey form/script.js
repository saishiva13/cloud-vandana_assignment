

function resetForm() {
  document.getElementById('surveyForm').reset();
}

function submitForm() {
alert('Form submitted successfully!');
  closePopup();
  resetForm();
}

function openPopup() {
  document.getElementById('confirmationPopup').style.display = 'block';
}

function closePopup() {
  document.getElementById('confirmationPopup').style.display = 'none';
}

document.getElementById('surveyForm').addEventListener('submit', function (e) {
  e.preventDefault();
  openPopup();
});
