//https://hackernoon.com/12-javascript-concepts-that-will-level-up-your-development-skills-b37d16ad7104

type tree = Leaf of int | Node of tree * tree

let rec exists_leaf test tree =
  match tree with
  | Leaf v -> test v
  | Node(left, right) ->
  exists_leaf test left
    || exists_leaf test right
let has_even_leaf tree =
  exists_leaf(fun n -> n mod 2 = 0) tree   
