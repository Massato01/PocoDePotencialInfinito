/**
 * Database name: Projeto
 * Foram criadas duas tabelas para este projeto
 * Uma tabela contém os valores dos cálculos para o elétron
 * A outra possui os valores dos cálculos para o próton
 * 
 * Author:  Carlos Chinen
 */

CREATE TABLE resultados_eletron (
    energia_ini_eletron double precision NOT NULL,
    energia_fin_eletron double precision NOT NULL,
    energia_foton_eletron double precision NOT NULL,
    comprimento_eletron double precision NOT NULL,
    frequencia_eletron double precision NOT NULL,
    broglie_ini_eletron double precision NOT NULL,
    broglie_fin_eletron double precision NOT NULL,
    vel_ini_eletron double precision NOT NULL,
    vel_fin_eletron double precision NOT NULL,
    func_onda_ini_eletronpt1 double precision NOT NULL,
    func_onda_ini_eletronpt2 double precision NOT NULL,
    func_onda_fin_eletronpt1 double precision NOT NULL,
    func_onda_fin_eletronpt2 double precision NOT NULL,
    prob_ini_eletron double precision NOT NULL,
    prob_fin_eletron double precision NOT NULL,
);

CREATE TABLE resultados_proton (
    energia_ini_eletron double precision NOT NULL,
    energia_fin_proton double precision NOT NULL,
    energia_foton_proton double precision NOT NULL,
    comprimento_proton double precision NOT NULL,
    frequencia_proton double precision NOT NULL,
    broglie_ini_proton double precision NOT NULL,
    broglie_fin_proton double precision NOT NULL,
    vel_ini_proton double precision NOT NULL,
    vel_fin_proton double precision NOT NULL,
    func_onda_ini_protonpt1 double precision NOT NULL,
    func_onda_ini_protonpt2 double precision NOT NULL,
    func_onda_fin_protonpt1 double precision NOT NULL,
    func_onda_fin_protonpt2 double precision NOT NULL,
    prob_ini_proton double precision NOT NULL,
    prob_fin_proton double precision NOT NULL,
);