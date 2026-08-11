# CustomSwords

A modern, high performance Paper Minecraft plugin designed for **Paper 1.21+** (Java 21). **CustomSwords** adds custom weapons with unique combat abilities, fully customizable display names, lore, sound effects, and cooldowns.

Utilizing Minecraft's **PersistentDataContainer (PDC)**, custom swords remain fully functional even after item modifications like `/ie rename` or `/ie lore add` from third party plugins.

---

## Features

* **5 Custom Weapons & Abilities:**
  * **Flame Sword (`flamesword`):** Activated with `Shift + F`. Increases the next 5 hits with +4 bonus attack damage and summons a cosmetic fire ring.
  * **Wemmbu Swing (`wemmbuswing`):** Activated with `Shift + Right-Click`. Launches the user with high velocity in the direction they are looking.
  * **Spoke Wand (`spokewand`):** Activated with `Shift + Right-Click`. Freezes all nearby entities within a 3-block radius for 4 seconds.
  * **Dance Sword (`dancesword`):** Activated with `Shift + F`. Grants 5 seconds of total damage invincibility.
  * **Theos Blast (`theosblast`):** Activated with `Shift + Right-Click`. Triggers a massive explosion (equivalent to 8 TNT Minecarts) that damages nearby enemies without destroying blocks or harming the user.

* **Hex & Legacy Color Support:** Full support for `&#RRGGBB` hex color formatting and standard legacy color codes (`&e`, `&l`, etc.) using Paper's Adventure API.
* **Italic Overrides Fixed:** Standardized lore and display name parsing prevents default Minecraft italicization (`&o`).
* **ItemEdit Immunity:** Uses NBT PersistentDataContainer tags, keeping weapon identity intact regardless of item name or lore alterations.
* **Tab Completion & Admin Permission:** Built-in tab completion for easy command navigation restricted exclusively to operators/admin permission nodes.

---

## Commands & Aliases

Main command: `/customsword` (Aliases: `/cs`, `/sword`)

| Command | Description | Permission |
| :--- | :--- | :--- |
| `/cs give <player> <sword>` | Gives a specific custom sword to a player | `customswords.admin` |
| `/cs list` | Displays a list of all available custom swords | `customswords.admin` |
| `/cs reload` | Reloads `config.yml` and flushes active cooldowns | `customswords.admin` |

---

## Permissions

* `customswords.admin` – Grants access to all `/customsword` commands and tab completions (Default: `op`).
