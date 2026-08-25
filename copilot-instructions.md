# Copilot Instructions

## Design Guide

- Keep a cohesive visual theme across the UI and avoid generic default styling.
- Prefer utility-class composition from `socops/src/main/resources/static/css/app.css`.
- Add any new reusable CSS utilities to `app.css` instead of inline one-off styles.
- Keep board behavior and visuals aligned with game rules (center cell is always free and selected, and not toggleable).
- Use subtle, purposeful motion and maintain readable contrast for all interactive states.
