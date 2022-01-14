# spring-liquibase

## Pourquoi?
Le but de ce projet est de faire des tests de l'intégration de Liquibase avec Spring.\
La version 1 contient la table Person\
La version 2 contient la table Company

## Spring
L'application est configurée pour mettre à jour la db au lancement.\
Spring utilise alors Liquibase pour le faire

## Maven
### Update
Dans le cas des updates, on peut utiliser Maven et son plugin.\
Les commandes sont les suivantes:\
`mvn liquibase:update`

### Rollback
Les rollback ne peuvent être utilisé que par maven. Il est impossible de faire un rollback depuis Spring.\
L'usage de plusieurs options sont contraintes par l'utilisation d'une license professionnelle.
Les commandes sont les suivantes:\
`mvn liquibase:rollback -Dliquibase.rollbackCount=1`

## Docker
Utilisation de docker compose.\
Pour faire fonctionner le projet il suffit de jouer les commandes suivantes dans cet ordre:\
`docker-compose -f docker-compose.database.yml up`\
`docker-compose -f docker-compose.liquibase.yml up`


