// Pide la lista de personajes al servidor
function fetchCharacters() {
    fetch('/EpicB/AdminServlet?action=list')
        .then(response => response.json())
        .then(data => {
            const characterListElement = document.getElementById('characterList');
            characterListElement.innerHTML = ''; // Para limpiar listas existentes
            data.forEach(character => {
                const li = document.createElement('li');
                li.textContent = `${character.nameCharacter} from ${character.universCharacter}`;
                characterListElement.appendChild(li);
            });
        })
        .catch(error => console.error('Error fetching characters:', error));
}

// Petición inicial al cargar la página 
document.addEventListener('DOMContentLoaded', fetchCharacters);
