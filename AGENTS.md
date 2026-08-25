# Working In This Repository

## Mandatory Development Checklist

- [ ] Lint/validate: run `./mvnw validate`; no dedicated linter is configured, so inspect changed frontend files and report that limitation.
- [ ] Build: run `./mvnw clean package`.
- [ ] Test: run `./mvnw test`.

Run all commands from `socops/`. The app serves on port `8080`; see [.vscode/tasks.json](.vscode/tasks.json) for equivalent tasks.

## Structure

- `socops/` is the Java 21 / Spring Boot app; `workshop/` is lab content and `docs/` is the GitHub Pages site. Start with [README.md](README.md) and [workshop/GUIDE.md](workshop/GUIDE.md).
- [BingoRestController.java](socops/src/main/java/com/socops/web/BingoRestController.java) serves the Thymeleaf page and `GET /api/bingo/fresh-board`.
- [BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java) owns pure board generation, flipping, and win detection. [IcebreakerPrompts.java](socops/src/main/java/com/socops/data/IcebreakerPrompts.java) owns the 24 prompts.

## Frontend Contract

- [game.html](socops/src/main/resources/templates/game.html) contains the inline browser engine. It fetches boards, detects wins, and stores snapshots under `socops-bingo-snapshot` in `localStorage`.
- Keep Java board rules and browser algorithms synchronized. The center free cell is both free and selected, and cannot be toggled.
- Add utilities to [app.css](socops/src/main/resources/static/css/app.css); follow [CSS instructions](.github/instructions/css-utilities.instructions.md) and [frontend design instructions](.github/instructions/frontend-design.instructions.md).

## Constraints And Tests

- Board logic expects a positional 25-cell board. `flipCell` returns a copied list; client snapshot restoration only checks board length, so state-shape changes need stale-snapshot handling.
- Add focused JUnit 5 coverage in [BoardAssemblerTests.java](socops/src/test/java/com/socops/service/BoardAssemblerTests.java). Integration, browser, and API error-path tests are not currently configured.
- There is no persistence, multiplayer sync, authentication, database, or REST mutation endpoint. Do not commit `socops/target/`.

## Existing Customizations

Use the [TDD agents](.github/agents/tdd.agent.md), [Pixel Jam](.github/agents/pixel-jam.agent.md), [UI Review](.github/agents/ui-review.agent.md), [Quiz Master](.github/agents/quiz-master.agent.md), and [setup/cloud prompts](.github/prompts/setup.prompt.md) when their workflows fit. See [multi-agent guidance](workshop/04-multi-agent.md).
