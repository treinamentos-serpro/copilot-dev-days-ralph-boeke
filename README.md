🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

# Soc Ops 🎯

Turn any in-person meetup into a fast, fun icebreaker with **Social Bingo**.  
Match people to prompts, mark your board, and race to 5-in-a-row.

[🎮 Live Demo](https://copilot-dev-days.github.io/agent-lab-java/) • [📚 Lab Guide](workshop/GUIDE.md)

---

## Why this repo

Soc Ops is both:

- a playable Spring Boot + Thymeleaf app
- a hands-on GitHub Copilot Agent workshop

You can run the game, explore the code, and practice real multi-agent workflows in one place.

---

## 🚀 Quick start

### Prerequisites

- [Java 21 JDK](https://adoptium.net/) or higher
- [Apache Maven 3.9+](https://maven.apache.org/) (or use the included Maven Wrapper)

### Run locally

```bash
cd socops
./mvnw spring-boot:run
```

Open `http://localhost:8080`.

### Validate, build, and test

```bash
cd socops
./mvnw validate
./mvnw clean package
./mvnw test
```

---

## 📚 Workshop path

| Part | Focus |
|------|-------|
| [**00**](workshop/00-overview.md) | Overview & Checklist |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering |
| [**02**](workshop/02-design.md) | Design-First Frontend |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development |

> Prefer offline reading? Everything is in [`workshop/`](workshop/).

---

## 🧩 Project structure

- `socops/` — Java 21 Spring Boot app
- `workshop/` — step-by-step lab content
- `docs/` — GitHub Pages site for the lab

---

Deploys automatically to GitHub Pages on push to `main`.
