# Copilot Instructions

## Project Context

- This repository contains a Java 21 / Spring Boot app in `socops/`.
- The main game UI lives in `socops/src/main/resources/templates/game.html` and the styling system is in `socops/src/main/resources/static/css/app.css`.
- Board logic is managed in `socops/src/main/java/com/socops/service/BoardAssembler.java` and must stay aligned with the browser-side game rules.
- The app is intentionally lightweight: no persistence, multiplayer sync, or database layer is required.

## Design Guide

### 1. Avoid generic AI-generated aesthetics

Do not default to safe, template-like styling. The UI should feel intentionally designed and context-specific, not like a stock SaaS landing page.

Prefer:
- distinctive typography and visual rhythm
- memorable color systems with a clear dominant hue and sharp accents
- layered backgrounds, gradients, patterns, or atmosphere-building textures
- layouts that feel crafted for the game rather than copied from common UI patterns

Avoid:
- plain system fonts or overused web-safe stacks
- clichéd purple-white gradients and soft pastel everything
- overly symmetrical, predictable card layouts
- “AI slop” styling that feels generic, flat, and safe at the expense of character

### 2. Typography and visual character

Choose type that has presence and personality. Use expressive headings and a restrained supporting type scale so the interface feels premium and intentional.

Good direction:
- strong display typography for title and status moments
- one standout typeface or stylistic pairing with clear hierarchy
- deliberate spacing and emphasis to make the UI feel more editorial than utilitarian

Avoid:
- generic sans-serif everywhere
- default fonts that flatten the experience
- too many competing font styles without a clear hierarchy

### 3. Color and theme system

Build a cohesive visual identity around a single aesthetic direction. Use CSS variables for recurring values so the theme remains consistent and easy to adjust.

Recommended approach:
- define a small palette with a dominant color, one or two contrast accents, and neutral surfaces
- use strong, confident accent color rather than a timid spread of equal tones
- pair dramatic color with readable text and controlled contrast
- adapt the theme to the game’s mood without overloading the UI

### 4. Motion and interaction

Use motion sparingly but deliberately. Micro-interactions should feel deliberate and polished rather than decorative noise.

Prefer:
- CSS-only transitions and subtle reveals
- a few dramatic moments such as load animations, active-cell pulses, or win-state emphasis
- staggered effects with animation-delay for a more composed feel

Avoid:
- constant motion on every element
- noisy bouncing or over-animated transitions
- decorative effects that distract from gameplay and readability

### 5. CSS utility conventions

This project already uses custom utility classes in `socops/src/main/resources/static/css/app.css`.

Follow these conventions:
- prefer composable utility classes over ad hoc one-off CSS
- keep specificity low and avoid deeply nested selectors
- add utilities in the stylesheet when a pattern is reused
- use CSS variables for theme colors, spacing, and shadow values

Useful patterns include:
- layout utilities such as `flex`, `grid`, `items-center`, and `justify-between`
- spacing helpers such as `p-*`, `px-*`, `py-*`, and `gap-*`
- text and color utilities such as `text-*`, `font-*`, `bg-*`, and `rounded-*`
- utility-first composition for simple, consistent UI building blocks

### 6. Implementation checklist for front-end changes

Before finishing a UI change, verify that it:
- feels visually distinctive and not generic
- maintains readability and clarity during gameplay
- uses theme variables and utility classes consistently
- respects the board/game context rather than injecting unrelated visual noise
- keeps the browser logic and Java rule logic synchronized when updating the board behavior

## Project Standards

- Keep the Java board rules and browser algorithms synchronized.
- The center free cell should remain both free and selected, and it must not be toggled.
- Preserve the positional 25-cell board contract and stale-snapshot compatibility when changing state shape.
- Prefer small, cohesive improvements over broad, noisy rewrites.

## Final Guidance

Treat the UI as a product experience, not just a page. Aim for a polished, distinctive interface that is playful, readable, and clearly designed for this application’s social Bingo scenario.
