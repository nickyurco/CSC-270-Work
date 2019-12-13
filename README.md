# H. G. Wells, *The Time Machine*

__Bibliography:__

Title: The Time Machine
Author: H. G. Wells
Release Date: October 2, 2004 [EBook #35] 
Last Updated: January 14, 2018
Language: English
Character set encoding: UTF-8

__The Text:__
*The Time Machine* is a classic novel of the sci-fi genre about a Time Traveller who travels far forward in time to gain a glimpse into Earth's distant future and recount the stories of his travels to a group of dinner guests. I chose to analyze this texts because it is one of the earliest examples of the sci-fi genre entering the realm of popular culture. 

`text/TimeMachine.cex`is where you can find the citable edition of the text, which has been built to the standards of CITE architecture. It has been created to enable seemless machine processing of the text. 

A human-readable HTML site has also been created, its pages can be found in `html/pages/`. Begin with `index.html` which acts as a table of contents. The script that builds a set of pages from a `.cex` file can be found `CSC-270-Work/src/main/scala/web-writer.scala` . A link back to this repository is included in `index.html`

all scripts can be run using the sbt console interface in a unix terminal. 

Everything in this repository is public domain and free to use by anyone. 

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

__Spell Check__

My version of *The Time Machine* has been spell checked against two dicitonaries. One is a standard English word-list generated from the SCOWL online tool. The second is a user-dictionary. These two dictionaries can be found at `validation-data/standard-dictionary.txt` and `validation-data/user-dictionary.txt` respectively. 

The spell check script is found at `scripts/corpus-spelling.sc`

loading these scripts in the sbt console shows that no "bad words" (words not found in either dictionary) appear in the text. The purpose of the user dictionary is to hold all words that weren't found in the standard dictionary that I deemed to be correct words in the book. These words include names, words made up by Wells, words with a British English, or French spelling, and words that didn't appear in the dictionary with their punctuation removed (ex. Im, the contraction of I am). 

The spell check helped me to identify an instance of the string "-ED" which is used to indicate the end of a footnote. I was able to remove this in order to ensure a proper representation of Wells text. 

__N Gram Analysis__ 

An NGram is a recurring pattern of N-number of words. This repository includes a basic Scala script showing how NGram analysis can work with, and be enhanced by, the CITE Architecture. The script can be found at `scripts/ngrams2.sc`

Loading this script in the sbt console gives the user access to the `ngrams()` funciton. This allows the user to input any number (n) as the single parameter and the function will return a histogram of the most occuring n-grams for that input and how many times each occurs. For example, `ngrams(3)` will return a histogram of the texts 3-grams. In order to clear up clutter, this script ignores any ngram that occurs less than 5 times in the text. 

As was to be expected, the most used 3-grams in the text were, "the Time Machine" which occurs 29 times and "the Time traveller" which occurs 53 times. Which leads to the conclusion that, despite the texts name, this story is more about the man than the machine.

Another interesting observation is that, when looking at 1-grams (basically just a list of word frequencies) I found that the word "I" occurs the second most of all words (1241). Looking into it, I realized that this is because the text is wrritten from the first-person point of view and that the narrator (a dinner guest of the Time Traveller) spends a lot of time reflecting on himself and his role in the story. It is not just about the Time Traveller and his machine. 

last updated: 12/13/2019
Contributors: Christopher Blackwell

