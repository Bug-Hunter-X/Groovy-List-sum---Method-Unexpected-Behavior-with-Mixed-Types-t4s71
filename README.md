# Groovy List sum() Method Unexpected Behavior
This example demonstrates unexpected behavior of Groovy's `sum()` method when the list contains a mix of numeric and string types.
The initial list of integers sums correctly, but when the list is reassigned to contain strings, attempting to use `sum()` results in an exception due to Groovy's dynamic typing not automatically handling the type change within the list.
The solution provides a way to handle potential type mismatches.