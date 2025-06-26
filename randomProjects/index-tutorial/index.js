function enviarWhats(event){
    event.preventDefault()


const input = document.getElementById("nome").value;
const text = document.getElementById("texto").value;
const tel = '5538988658030';

const mensagem = `Ola, me chamo ${input}, e gostaria que ${text}`;
const msgFormated = encodeURIComponent(mensagem);

const url = `https://whatsa.me/${tel}/?t=${msgFormated}`;

window.open(url,'_blank');

}
