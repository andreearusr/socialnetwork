package com.map.socialnetwork.repository;

import com.map.socialnetwork.domain.Friendship;
import com.map.socialnetwork.domain.Tuple;
import com.map.socialnetwork.domain.User;
import com.map.socialnetwork.exceptions.ValidatorException;

import java.util.List;

public interface FriendshipRepository extends Repository<Tuple<User, User>, Friendship> {
    void deleteFriendshipsRelatedToUser(User user);
    void update(Friendship friendship) throws ValidatorException;
    List<User> getFriends(User user);
    List<Friendship> getReceivedRequests(User user);
    List<Friendship> getSentPendingRequests(User user);
    List<User> getUnrelatedUsers(User user);
    List<Friendship> getAll(long id);
}
