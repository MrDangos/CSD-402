switch (day) {
    case "MONDAY":
        System.out.println("Start of the week");
        break;
    case "FRIDAY":
        System.out.println("Almost weekend!");
        break;
}

switch (day) {
    case "MONDAY" -> System.out.println("Start of the week");
    case "FRIDAY" -> System.out.println("Almost weekend!");
}

