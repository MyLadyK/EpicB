document.getElementById('addCharacterForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = new FormData(this); // Utiliza FormData para manejar archivos y otros datos del formulario

    fetch('AdminServlet', {
        method: 'POST',
        body: formData
    })
    .then(response => {
        if (response.ok) {
            alert('Character added successfully!');
            // Optionally, redirect or update the UI
        } else {
            alert('Failed to add character.');
        }
    })
    .catch(error => console.error('Error adding character:', error));
});
