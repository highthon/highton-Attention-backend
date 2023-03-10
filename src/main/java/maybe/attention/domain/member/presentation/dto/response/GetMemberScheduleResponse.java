package maybe.attention.domain.member.presentation.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GetMemberScheduleResponse {
    private final String scheduleTitle;
    private final String scheduleDate;
    private final String organizerName;
}
