import { Component, OnInit } from '@angular/core';
import { Usuario } from '../../../shared/model/usuario';
import { DatePipe } from '@angular/common';
import { FiltrarPipe } from '../../../shared/pipes/filtrar.pipe';

@Component({
  selector: 'app-usuarios-listagem',
  imports: [
    DatePipe,
    FiltrarPipe
  ],
  templateUrl: './usuarios-listagem.component.html',
  styleUrl: './usuarios-listagem.component.scss'
})
export class UsuariosListagemComponent implements OnInit {
  ngOnInit(): void {
    this.carregarUsuarios();
  }

  protected usuarios: Usuario[] = [];

  protected filtro = '';

  protected async carregarUsuarios() {
    return fetch('http://localhost:3000/usuarios')
      .then(res => res.json())
      .then(usuarios => this.usuarios = usuarios);
  }
}
