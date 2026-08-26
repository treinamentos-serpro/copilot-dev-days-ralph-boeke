package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "That went better than expected!",
            "Someone mentions blockers",
            "We should automate that",
            "Someone gives a teammate a shoutout",
            "Let's add that to the backlog",
            "Someone laughs at a past decision",
            "Quick win mentioned",
            "We said this last retro too…",
            "A meme appears in the retro board",
            "Someone admits they skipped PR comments",
            "Share one sprint surprise",
            "A process improvement gets unanimous thumbs-up",
            "Two people had the same frustration",
            "Someone references a bug that shouldn't happen",
            "A definition of done debate breaks out",
            "A team norm gets updated",
            "Long-standing tech debt gets called out",
            "Someone voluntarily owns a tough action item",
            "Teach the team a keyboard shortcut",
            "I think we need to rethink…",
            "Share the most chaotic Slack message",
            "Sprint velocity discussed",
            "Someone says we need more tests",
            "Action item assigned to everyone"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
