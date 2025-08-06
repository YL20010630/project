@RestController
@RequestMapping("/api/sales")
public class SalesController {

    @GetMapping
    public Map<String, Object> getSales(@RequestParam String type) {
        List<String> labels;
        List<Integer> values;

        if ("month".equals(type)) {
            labels = List.of("一月", "二月", "三月", "四月");
            values = List.of(100, 200, 150, 180);
        } else if ("year".equals(type)) {
            labels = List.of("2021", "2022", "2023", "2024");
            values = List.of(5000, 6200, 7100, 8900);
        } else {
            labels = List.of();
            values = List.of();
        }

        Map<String, Object> result = new HashMap<>();
        result.put("labels", labels);
        result.put("values", values);
        return result;
    }
}
