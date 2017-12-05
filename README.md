# CHMVdWPlaceholderAPI
###### CommandHelper Extension for MVdWPlaceholderAPI ######

## Functions
### set_mvdwplaceholders(player,string)

**player** can be null if not required.

**string** is the string you want to change.

Replaces all instance of particular matched patterns with data collected from across your server. This can include player data, plugin data, server data or whatever, and in case of rapid use is kept up-to-date on a moment-to-moment basis.

[See what Placeholders are available here.](https://www.spigotmc.org/wiki/mvdw-placeholders/)

#### Example ####

`msg(
  set_mvdwplaceholders(player(),'You have murdered {stat_kills} creatures!')
)`
might tell the player "You have murdered 516 creatures!"
