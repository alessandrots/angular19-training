import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { environment } from '../environment';
import { provideConfiguracaoBasica } from '@dsmpf/ngx-dsmpf/inicializacao';

export const appConfig: ApplicationConfig = {
  providers: [
    provideConfiguracaoBasica({
      parametrosAplicacao: environment.parametrosAplicacao,
      parametrosSeguranca: environment.parametrosSeguranca,
      rotas: { primeiroNivel: routes, gerarEstruturaPadrao: true }
    })
  ]
};