# 🍽️ Cardápio

Aplicação full stack para cadastro e visualização de itens de um cardápio, com front-end em **React + TypeScript** e back-end em **Java + Spring Boot**.

## 📋 Sobre o projeto

O Cardápio permite:
- Visualizar os itens cadastrados (título, imagem e preço) em formato de cards;
- Cadastrar novos itens através de um modal.

## 🚀 Tecnologias

### Front-end
- React
- TypeScript
- Vite
- React Query (`@tanstack/react-query`)
- Axios

### Back-end
- Java
- Spring Boot
- Spring Data JPA
- Flyway (migrations)
- PostgreSQL

## 📁 Estrutura do projeto

```
cardapio/
├── menu/                              # front-end (React + TypeScript)
│   └── src/
│       ├── components/
│       │   ├── card/
│       │   └── create-modal/
│       ├── hooks/
│       │   ├── useFoodData.ts
│       │   └── useFoodDataMutate.ts
│       ├── interface/
│       │   └── FoodData.ts
│       ├── App.tsx
│       └── main.tsx
├── src/                               # back-end (Spring Boot)
│   └── main/
│       ├── java/com/example/cardapio/
│       │   ├── controller/
│       │   │   └── FoodController.java
│       │   └── food/
│       │       ├── Food.java
│       │       ├── FoodRepository.java
│       │       ├── FoodRequestDTO.java
│       │       └── FoodResponseDTO.java
│       └── resources/
│           ├── application.properties
│           └── db/migration/
│               └── V1__create-table-foods.sql
├── .mvn/wrapper/
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## 📸 Screenshots

**Tela principal**
<img width="964" height="874" alt="Captura de tela 2026-08-29 013513" src="https://github.com/user-attachments/assets/38d616b9-0eb1-4a02-b77e-1d4ba769c42b" />

**Cadastro de novo item**
<img width="811" height="658" alt="Captura de tela 2026-08-29 013522" src="https://github.com/user-attachments/assets/0e812b98-e644-42f8-97ff-82c9ec3bbb34" />

## 🔌 API

Base URL: `http://localhost:8080`

| Método | Rota    | Descrição                        |
|--------|---------|-----------------------------------|
| GET    | `/food` | Lista todos os itens do cardápio |
| POST   | `/food` | Cadastra um novo item do cardápio |

**Exemplo de payload (POST `/food`):**
```json
{
  "title": "Pizza Margherita",
  "image": "https://exemplo.com/imagem.jpg",
  "price": 45
}
```

## ⚙️ Como rodar o projeto

### Pré-requisitos
- Node.js (v18+)
- Java 17+
- Banco de dados PostgreSQL configurado

### Back-end
```bash
# na raiz do repositório
# configure o banco de dados em src/main/resources/application.properties
./mvnw spring-boot:run
```
O back-end vai rodar em `http://localhost:8080`.

### Front-end
```bash
cd menu
npm install
npm run dev
```
O front-end vai rodar em `http://localhost:5173` (padrão do Vite).

## 🛣️ Roadmap / melhorias futuras

- [ ] Validação de campos obrigatórios no back-end
- [ ] Endpoint de edição e remoção de itens
- [ ] Tratamento de loading e erro no front-end
- [ ] Testes automatizados
