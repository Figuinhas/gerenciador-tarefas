document.querySelectorAll('.btn-delete').forEach(button => {
    button.addEventListener('click', (event) => {
        if (!confirm('Tem certeza que deseja excluir esta tarefa?')) {
            event.preventDefault(); // cancela o clique se o usuário disser não
        }
    });
});