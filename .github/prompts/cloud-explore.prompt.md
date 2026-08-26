---
agent: agent
argument-hint: Optionally specify variations
tools: ['github/create_pull_request_with_copilot', 'todo']
---

Your goal is to explore potential solutions with a remote coding agent for a given plan.

If the argument is "design variations", assume the target is the Soc Ops start screen/landing page in `socops/`.

For each variation handoff, include these repository-specific constraints:
- Keep the work scoped to `socops/src/main/resources/templates/game.html` and `socops/src/main/resources/static/css/app.css` unless a tiny supporting doc update is essential.
- Follow `AGENTS.md`, `copilot-instructions.md`, `.github/instructions/frontend-design.instructions.md`, and `.github/instructions/css-utilities.instructions.md`.
- Preserve all bingo rules and client behavior in `game.html`, especially the center free cell behavior and `socops-bingo-snapshot` localStorage compatibility.
- Add reusable CSS utilities to `app.css` instead of relying on new one-off inline styles.
- Make the 3 variations clearly different in theme, typography, color, and motion so the resulting PRs are easy to compare.
- Ask the coding agent to keep the diff surgical, validate the change, and include a screenshot or concise visual summary when tooling allows.

1. Look at the plan and the optional argument to identify 3 variations to explore (trade-offs, interfaces, approaches, technologies, etc).
2. Create #tool:todo for each variation.
3. Call #tool:github/create_pull_request_with_copilot to hand off the specifics for each variation to implement. Coding agent will handle the implementation details, so your focus should be on the overall plan, repo constraints, and what makes each variation distinct.

End with summarizing each variation and compare & contrast.