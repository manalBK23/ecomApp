# Ecommerce Application


# 📝 Description

Ce projet représente le backend d'une application e-commerce.
Il offre des API permettant de gérer les produits, les utilisateurs, les commandes, ainsi que d'autres fonctionnalités essentielles au fonctionnement d'une plateforme de commerce électronique.

# 🚀 Fonctionnalités

- **Gestion des utilisateurs** : prise en charge de l'inscription, de la connexion et de la mise à jour des profils utilisateurs.  
- **Gestion des produits** : fonctionnalités pour ajouter, modifier, supprimer et consulter les produits disponibles.  
- **Gestion des commandes** : création de nouvelles commandes, suivi de leur statut et consultation de l'historique des commandes.  
- **Intégration avec des services tiers** : prise en charge des paiements sécurisés et des notifications via des solutions externes.  

# 🛠️ Architecture utilisée

Le projet adopte une architecture de microservices, comprenant les éléments suivants :  
- **Config Service** : gestion centralisée des configurations applicatives.  
- **Discovery Service** : service de découverte facilitant l'intercommunication entre microservices.  
- **Billing Service** : gestion des processus de facturation et des paiements.  
- **Inventory Service** : gestion des stocks et des disponibilités des produits.  
- **Customer Service** : gestion des informations et des données des clients.

# ⚙ Technologies utilisées
Langage : Java
Framework : Spring Boot
Base de données :H2
Gestion des dépendances : Maven

# ScreenShots:

# Discovery

<img width="960" alt="discovery" src="https://github.com/user-attachments/assets/7c75da70-b3c8-4e69-bf5f-678f0ed4ddd8" />

# Configuration

<img width="634" alt="config" src="https://github.com/user-attachments/assets/db121869-9917-4a69-9a48-827407ad5ca8" />

# Affichage du Billing avec Gateway

<img width="467" alt="BILLING1" src="https://github.com/user-attachments/assets/65ec9063-4d9e-4f58-8e6b-d0b1603e08a0" />

<img width="728" alt="BILLING" src="https://github.com/user-attachments/assets/c08c46da-bdf0-4d40-87c2-7e7114ac5631" />

# Installation

Clonez le dépôt :

git clone https://github.com/manalBK23/ecomApp.git

Naviguez dans le répertoire du projet :

cd ecom-application

Configurez les paramètres de la base de données dans application.properties :

spring.datasource.url=jdbc:h2://localhost:3306/ecom_db

Compilez et packagez l'application :

mvn clean package

# Utilisation

L'application est disponible à l'adresse suivante : http://localhost:8080 Auteur Manal Boukheffa
