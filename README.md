# H. G. Wells, *The Time Machine*

__Bibliography:__

Title: The Time Machine
Author: H. G. Wells
Release Date: October 2, 2004 [EBook #35] 
Last Updated: January 14, 2018
Language: English
Character set encoding: UTF-8

__The Text:__
`text/TimeMachine.cex`is where you can find the citable edition of the text, which has been built to the standards of CITE architecture. It has been created to enable seemless machine processing of the text. 

A human-readable HTML site has also been created, its pages can be found in `html/pages/`. Begin with `index.html` which acts as a table of contents. The script that builds a set of pages from a `.cex` file can be found `CSC-270-Work/src/main/scala/web-writer.scala` . A link back to this repository is included in `index.html`

all scripts can be run using the sbt console interface in a unix terminal. 

__Character Validation__

The text has been machine validated as to character-set using a Scala script. The script is `scripts/corpus-char-validate` and it sends the resulting table to a file named `charTable.md`. The following is a complete inventory of the characters present in this text:

| Character | Character | Character | Character | Character |
|-----------|-----------|-----------|-----------|-----------|
| `space` (20) | `!` (21) | `(` (28) | `)` (29) | `,` (2c) |
| `-` (2d) | `.` (2e) | `:` (3a) | `;` (3b) | `?` (3f) |
| `A` (41) | `B` (42) | `C` (43) | `D` (44) | `E` (45) |
| `F` (46) | `G` (47) | `H` (48) | `I` (49) | `J` (4a) |
| `K` (4b) | `L` (4c) | `M` (4d) | `N` (4e) | `O` (4f) |
| `P` (50) | `Q` (51) | `R` (52) | `S` (53) | `T` (54) |
| `U` (55) | `V` (56) | `W` (57) | `X` (58) | `Y` (59) |
| `[` (5b) | `]` (5d) | `_` (5f) | `a` (61) | `b` (62) |
| `c` (63) | `d` (64) | `e` (65) | `f` (66) | `g` (67) |
| `h` (68) | `i` (69) | `j` (6a) | `k` (6b) | `l` (6c) |
| `m` (6d) | `n` (6e) | `o` (6f) | `p` (70) | `q` (71) |
| `r` (72) | `s` (73) | `t` (74) | `u` (75) | `v` (76) |
| `w` (77) | `x` (78) | `y` (79) | `z` (7a) | `ç` (e7) |
| `ü` (fc) | `‘` (2018) | `’` (2019) | `“` (201c) | `”` (201d) |

This script is useful because it allows a user to easily identify and change character anomalies in the text and adjust ambiguous characters. Any further operations on the full text without character validation would yield innacturate results. 
