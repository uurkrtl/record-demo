package net.ugurkartal;

public record Animal(
        long id,
        String name,
        String species,
        int age,
        Owner owner,
        Species food
) {
}
