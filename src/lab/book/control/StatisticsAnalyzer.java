package lab.book.control;

import java.util.HashMap;
import java.util.Map;

import lab.book.entity.Magazine;
import lab.book.entity.Novel;
import lab.book.entity.Publication;
import lab.book.entity.ReferenceBook;

public class StatisticsAnalyzer {
	public Map<String,Double> calculateAveragePriceByType(Publication[] publications){
		Map<String, Double> avgMap = new HashMap<String, Double>();
		Map<String, Integer> countMap = new HashMap<>();
		Map<String, Double> priceMap = new HashMap<>();
		for (Publication publication : publications) {
			if (publication != null) { // null 체크 추가
				String type = getPublicationType(publication);
				countMap.put(type, countMap.getOrDefault(type, 0) + 1);
				priceMap.put(type, priceMap.getOrDefault(type, 0.0) + publication.getPrice());
			}
		}
		avgMap.put("소설", priceMap.getOrDefault("소설", 0.0) / countMap.getOrDefault("소설", 1));
		avgMap.put("잡지", priceMap.getOrDefault("잡지", 0.0) / countMap.getOrDefault("잡지", 1));
		avgMap.put("참고서", priceMap.getOrDefault("참고서", 0.0) / countMap.getOrDefault("참고서", 1));
		avgMap.put("기타", priceMap.getOrDefault("기타", 0.0) / countMap.getOrDefault("기타", 1));
		return avgMap;
	}

	public Map<String,Double> calculatePublicationDistribution(Publication[] publications){
		Map<String, Double> distriMap = new HashMap<String, Double>();
		Map<String, Integer> countMap = new HashMap<String, Integer>();

		for (Publication publication : publications) {
			if (publication != null) { // null 체크 추가
				String type = getPublicationType(publication);
				countMap.put(type, countMap.getOrDefault(type, 0) + 1);
			}
		}
		int totalPublications = publications.length;
		distriMap.put("소설", (double) (countMap.getOrDefault("소설", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("잡지", (double) (countMap.getOrDefault("잡지", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("참고서", (double) (countMap.getOrDefault("참고서", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("기타", (double) (countMap.getOrDefault("기타", 0) * 100.0 / Math.max(1, totalPublications)));
		return distriMap;
	}

	public void printStatics(Publication[] pubs) {
		System.out.println("타입별 평균 가격: "+calculateAveragePriceByType(pubs));
		System.out.println("출판물 분포: "+calculatePublicationDistribution(pubs));
		System.out.println("2007년 출판 비율: "+calculatePublicationRatioByYear(pubs, "2007"));
	}

	public double calculatePublicationRatioByYear(Publication[] publications, String Year) {
		double pubRatio = 0.0;
		int count=0;
		for (Publication publication : publications) {
			if (publication != null && publication.getPublishDate().startsWith(Year)) { // null 체크 추가
				count++;
			}
		}
		pubRatio = (double) count * 100.0 / Math.max(1, publications.length); // 0으로 나누는 오류 방지
		return pubRatio;
	}

	private String getPublicationType(Publication pub) {
		if (pub instanceof Novel) {
			 return "소설";
		} else if (pub instanceof ReferenceBook) {
			return "참고서";
		} else if (pub instanceof Magazine) {
			return "잡지";
		} else {
			return "기타";
		}
	}
}