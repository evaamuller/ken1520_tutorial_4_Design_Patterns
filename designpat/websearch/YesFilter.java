package designpat.websearch;

public class YesFilter implements QueryFilter {

    @Override
    public boolean filter(String query) {
        if (query.contains("friend")){
            return true;
        };
        return false;
    }
}
