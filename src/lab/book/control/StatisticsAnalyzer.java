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
			if (publication != null) { // null üũ �߰�
				String type = getPublicationType(publication);
				countMap.put(type, countMap.getOrDefault(type, 0) + 1);
				priceMap.put(type, priceMap.getOrDefault(type, 0.0) + publication.getPrice());
			}
		}
		avgMap.put("�Ҽ�", priceMap.getOrDefault("�Ҽ�", 0.0) / countMap.getOrDefault("�Ҽ�", 1));
		avgMap.put("����", priceMap.getOrDefault("����", 0.0) / countMap.getOrDefault("����", 1));
		avgMap.put("����", priceMap.getOrDefault("����", 0.0) / countMap.getOrDefault("����", 1));
		avgMap.put("��Ÿ", priceMap.getOrDefault("��Ÿ", 0.0) / countMap.getOrDefault("��Ÿ", 1));
		return avgMap;
	}

	public Map<String,Double> calculatePublicationDistribution(Publication[] publications){
		Map<String, Double> distriMap = new HashMap<String, Double>();
		Map<String, Integer> countMap = new HashMap<String, Integer>();

		for (Publication publication : publications) {
			if (publication != null) { // null üũ �߰�
				String type = getPublicationType(publication);
				countMap.put(type, countMap.getOrDefault(type, 0) + 1);
			}
		}
		int totalPublications = publications.length;
		distriMap.put("�Ҽ�", (double) (countMap.getOrDefault("�Ҽ�", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("����", (double) (countMap.getOrDefault("����", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("����", (double) (countMap.getOrDefault("����", 0) * 100.0 / Math.max(1, totalPublications)));
		distriMap.put("��Ÿ", (double) (countMap.getOrDefault("��Ÿ", 0) * 100.0 / Math.max(1, totalPublications)));
		return distriMap;
	}

	public void printStatics(Publication[] pubs) {
		System.out.println("Ÿ�Ժ� ��� ����: "+calculateAveragePriceByType(pubs));
		System.out.println("���ǹ� ����: "+calculatePublicationDistribution(pubs));
		System.out.println("2007�� ���� ����: "+calculatePublicationRatioByYear(pubs, "2007"));
	}

	public double calculatePublicationRatioByYear(Publication[] publications, String Year) {
		double pubRatio = 0.0;
		int count=0;
		for (Publication publication : publications) {
			if (publication != null && publication.getPublishDate().startsWith(Year)) { // null üũ �߰�
				count++;
			}
		}
		pubRatio = (double) count * 100.0 / Math.max(1, publications.length); // 0���� ������ ���� ����
		return pubRatio;
	}

	private String getPublicationType(Publication pub) {
		if (pub instanceof Novel) {
			 return "�Ҽ�";
		} else if (pub instanceof ReferenceBook) {
			return "����";
		} else if (pub instanceof Magazine) {
			return "����";
		} else {
			return "��Ÿ";
		}
	}
}