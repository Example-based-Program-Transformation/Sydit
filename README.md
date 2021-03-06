# Sydit

## Publication

> Meng, N., Kim, M., & McKinley, K. S. (2011, September). Sydit: creating and applying a program transformation from an example. In Proceedings of the 19th ACM SIGSOFT symposium and the 13th European conference on Foundations of software engineering (pp. 440-443).


## Overview

![Sydit-Overview](docs/figs/sydit.jpg)

## Description
When developers specify target locations to apply the genralized program transformation, Sydit first establishes context matching between the abstract context and each target location. The context matching checks whether the location contains a subtree where the edit can fit and modify similarly to the original one. If there is not such a match, Sydit gives up applying the transformation to the location because it cannot guarantee that the control and data dependence relations in the target matches the original one and therefore should be changed accordingly. On the other hand, if there is a match, Sydit customizes the abstract transformation with respect to the matched context and creates a concrete applicable edit script. The matching algorithm is implemented in a bottom-up manner. It first finds all candidate nodes matches for each leaf node in the abstract context based on AST node types. Starting with the candidate matches, Sydit identifies a best match for each path between a leaf node and the root node in the abstract context. To find the best match, it checks (1) whether every node on the path has their AST node types matched, (2) whether children lists of corresponding nodes have their sequences matched, (3) whether the identifiers are consistently mapped so that the control and data dependence relations in the original location are contained in a target location as well. Finally, if there are still more than one best match for a given path, Sydit conservatively gives up applying transformation because it cannot break the tie with any other heuristics. The edit script concretization consists of two parts: (1) to replace abstract identifiers with concrete ones, and (2) recalculate the position of each operation with respect to the target location. By applying the edit script to the location, we suggest a modified version of the program for developrs to review.

## Code Source
[http://people.cs.vt.edu/nm8247/program_transformation.html](http://people.cs.vt.edu/nm8247/program_transformation.html)