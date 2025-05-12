import { Observable } from "rxjs";

/**
console.log('Código síncrono no início');

new Promise((resolve, reject) => {
  console.log('Promise iniciada');
  resolve('Valor retornado');
})
  .then((valor) => console.log(valor))
  .catch((erro) => console.error(erro))
  .finally(() => console.log('Promise terminada'));
//promise sempre assíncrona
//a promise é executada uma única vez
//promise é eager
console.log('1Código síncrono no fim');
console.log('2Código síncrono no fim');
console.log('3Código síncrono no fim');
console.log('4Código síncrono no fim');
console.log('5Código síncrono no fim');
console.log('6Código síncrono no fim');
console.log('7Código síncrono no fim');
console.log('8Código síncrono no fim');
console.log('9Código síncrono no fim');
console.log('10Código síncrono no fim');
console.log('11Código síncrono no fim');
console.log('12Código síncrono no fim');
console.log('13Código síncrono no fim');
console.log('14Código síncrono no fim');
console.log('15Código síncrono no fim');
 */

console.log('Obs Código síncrono no início');

const o = new Observable((subscriber) => {

  console.log('Observable iniciado.');
  subscriber.next('valor 1 emitido');
  subscriber.next('valor 2 emitido');//são síncronas, executados imediatamente

  setTimeout(() => {
    subscriber.next('valor 3 emitido com atraso');
    subscriber.complete();
  }, 2000);//esse cara é um Web API, depois vai para a área da Macro Task

  //subscriber.complete();//qdo ele completa, ele ignora outro next q é o caso do Timeout, q tá em uma outra área
  //ele só emite se colocar o complete dentro da área de settimeout, ahhno caso tem q tirar esse daqui
});

const subscription = o.subscribe({
  next: (valor) => console.log(valor),
  error: (erro) => console.log(erro),
  complete: () => console.log('Completou!')
});

//esse cara cancelou a subscrição, no caso q está dentro do timeout
//subscription.unsubscribe();

//cada subscribe dispara a sua própria execução, tem sua própria execuçaõ do subscribe
console.log('Código síncrono no fim');

//o observable é cancelável o Promise não é



