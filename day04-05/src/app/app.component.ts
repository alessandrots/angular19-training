import { Component } from '@angular/core';
import { HomePortalComponent } from "./home-portal/home-portal.component";
import { LayoutComponent } from './layout/layout.component';
import { TwoWayPaiComponent } from "./exemplos/two-way/two-way-pai/two-way-pai.component";
import { UsuariosListagemComponent } from "./exemplos/usuarios/usuarios-listagem/usuarios-listagem.component";

@Component({
  selector: 'app-root',
  imports: [
    LayoutComponent,
    // HomePortalComponent,
    UsuariosListagemComponent
],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {

}
