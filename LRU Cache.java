class LRUCache {
    private ArrayList<int[]> cache;
    private int capacity;

    public LRUCache(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i = 0; i < cache.size(); i++){
            if(cache.get(i)[0] == key){
                int[] temp = cache.remove(i);
                cache.add(temp);
                return temp[1];
            }
        }    
        return -1;
    }
    
    
    public void put(int key, int value) {
        for(int i = 0; i < cache.size(); i++){
            if(cache.get(i)[0] == key){
                int[] temp = cache.remove(i);
                temp[1] = value;
                cache.add(temp);
                return;
            }
        }
        if(capacity == cache.size()) {
            cache.remove(0);
        }
        cache.add(new int[] {key, value});
    }
}
