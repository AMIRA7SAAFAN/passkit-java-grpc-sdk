// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/member/a_rpc.proto

package com.passkit.grpc.Members;

public final class ARpc {
  private ARpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025io/member/a_rpc.proto\022\007members\032\034google" +
      "/api/annotations.proto\032\033google/protobuf/" +
      "empty.proto\032\036io/common/common_objects.pr" +
      "oto\032\034io/common/distribution.proto\032\027io/co" +
      "mmon/message.proto\032\032io/common/pagination" +
      ".proto\032\026io/common/filter.proto\032\035io/membe" +
      "r/member_events.proto\032\026io/member/member." +
      "proto\032\027io/member/program.proto\032\024io/membe" +
      "r/tier.proto\032,protoc-gen-swagger/options" +
      "/annotations.proto2\277K\n\007Members\022}\n\rcreate" +
      "Program\022\020.members.Program\032\006.io.Id\"R\202\323\344\223\002" +
      "\025\"\020/members/program:\001*\222A4\n\010Programs\022\016Cre" +
      "ate Program\032\030Creates a program record\022\221\001" +
      "\n\rupdateProgram\022\020.members.Program\032\020.memb" +
      "ers.Program\"\\\202\323\344\223\002\025\032\020/members/program:\001*" +
      "\222A>\n\010Programs\022\016Update Program\032\"Updates a" +
      "n existing program record\022\200\001\n\ngetProgram" +
      "\022\006.io.Id\032\020.members.Program\"X\202\323\344\223\002\027\022\025/mem" +
      "bers/program/{id}\222A8\n\010Programs\022\013Get Prog" +
      "ram\032\037Gets an existing program record\022\222\001\n" +
      "\013copyProgram\022\033.members.ProgramCopyReques" +
      "t\032\006.io.Id\"^\202\323\344\223\002\032\"\025/members/program/copy" +
      ":\001*\222A;\n\010Programs\022\014Copy Program\032!Copies a" +
      "n existing program record\022\224\002\n\rdeleteProg" +
      "ram\022\006.io.Id\032\026.google.protobuf.Empty\"\342\001\202\323" +
      "\344\223\002\032*\025/members/program/{id}:\001*\222A\276\001\n\010Prog" +
      "rams\022\016Delete Program\032\241\001Deletes an existi" +
      "ng program record. Deleting a program re" +
      "sults in all tiers, and members undernea" +
      "th it being invalidated and removed. Nee" +
      "ds to be used with care.\022\300\001\n\026listProgram" +
      "sDeprecated\022\016.io.Pagination\032\020.members.Pr" +
      "ogram\"\201\001\202\323\344\223\002\023\022\021/members/programs\222Ae\n\010Pr" +
      "ograms\022\032List Programs [DEPRECATED]\032=[DEP" +
      "RECATED: OR operator is not supported] L" +
      "ists all programs0\001\022\361\003\n\014listPrograms\022\013.i" +
      "o.Filters\032\020.members.Program\"\277\003\202\323\344\223\002\033\"\026/m" +
      "embers/programs/list:\001*\222A\232\003\n\010Programs\022\rL" +
      "ist Programs\032\376\002Lists all programs\n\n<span" +
      " style=\"font-weight:bold\">About filter f" +
      "ield names, operators and sample payload" +
      "s:</span> <a target=\"_blank\" href=\"https" +
      "://help.passkit.com/en/articles/4133757-" +
      "membership-protocol-filtering-listing-an" +
      "d-counting-by-api#filter-programs\">https" +
      "://help.passkit.com/en/articles/4133757-" +
      "membership-protocol-filtering-listing-an" +
      "d-counting-by-api#filter-programs</a>0\001\022" +
      "h\n\ncreateTier\022\r.members.Tier\032\006.io.Id\"C\202\323" +
      "\344\223\002\022\"\r/members/tier:\001*\222A(\n\005Tiers\022\013Create" +
      " Tier\032\022Creates a new tier\022v\n\nupdateTier\022" +
      "\r.members.Tier\032\r.members.Tier\"J\202\323\344\223\002\022\032\r/" +
      "members/tier:\001*\222A/\n\005Tiers\022\013Update Tier\032\031" +
      "Updates a tier by tier id\022\227\001\n\007getTier\022\031." +
      "members.TierRequestInput\032\r.members.Tier\"" +
      "b\202\323\344\223\002$\022\"/members/tier/{programId}/{tier" +
      "Id}\222A5\n\005Tiers\022\010Get Tier\032\"Get a tier by p" +
      "rogram and tier ids\022\326\001\n\ndeleteTier\022\031.mem" +
      "bers.TierRequestInput\032\026.google.protobuf." +
      "Empty\"\224\001\202\323\344\223\002\'*\"/members/tier/{programId" +
      "}/{tierId}:\001*\222Ad\n\005Tiers\022\013Delete Tier\032NDe" +
      "letes a tier and members who belong to t" +
      "he tier. Needs to be used with care.\022\275\001\n" +
      "\023listTiersDeprecated\022\036.members.ListReque" +
      "stDeprecated\032\r.members.Tier\"u\202\323\344\223\002\020\022\016/me" +
      "mbers/tiers\222A\\\n\005Tiers\022\027List Tiers [DEPRE" +
      "CATED]\032:[DEPRECATED: OR operator is not " +
      "supported] Lists all tiers0\001\022\342\003\n\tlistTie" +
      "rs\022\024.members.ListRequest\032\r.members.Tier\"" +
      "\255\003\202\323\344\223\002\030\"\023/members/tiers/list:\001*\222A\213\003\n\005Ti" +
      "ers\022\nList Tiers\032\365\002Lists all tiers\n\n<span" +
      " style=\"font-weight:bold\">About filter f" +
      "ield names, operators and sample payload" +
      "s:</span> <a target=\"_blank\" href=\"https" +
      "://help.passkit.com/en/articles/4133757-" +
      "membership-protocol-filtering-listing-an" +
      "d-counting-by-api#filter-tiers\">https://" +
      "help.passkit.com/en/articles/4133757-mem" +
      "bership-protocol-filtering-listing-and-c" +
      "ounting-by-api#filter-tiers</a>0\001\022u\n\013enr" +
      "olMember\022\017.members.Member\032\006.io.Id\"M\202\323\344\223\002" +
      "\024\"\017/members/member:\001*\222A0\n\007Members\022\020Enrol" +
      " new Member\032\023Enrols a new member\022\276\001\n\021enr" +
      "olMemberPublic\022\017.members.Member\032\006.io.Id\"" +
      "\217\001\202\323\344\223\002\033\"\026/members/member/public:\001*\222Ak\n\007" +
      "Members\022\031Enrol new Member (public)\032EEnro" +
      "ls a new member into the default tier of" +
      " a program that is public\022\236\001\n\023getMemberR" +
      "ecordById\022\006.io.Id\032\017.members.Member\"n\202\323\344\223" +
      "\002\031\022\027/members/member/id/{id}\222AL\n\007Members\022" +
      "\037Get member record by PassKit ID\032 Gets m" +
      "ember record by PassKit ID\022\347\001\n\033getMember" +
      "RecordByExternalId\022(.members.MemberRecor" +
      "dByExternalIdRequest\032\017.members.Member\"\214\001" +
      "\202\323\344\223\0025\0223/members/member/externalId/{prog" +
      "ramId}/{externalId}\222AN\n\007Members\022 Get mem" +
      "ber record by External ID\032!Gets member r" +
      "ecord by External ID\022\360\001\n\rcheckInMember\022 " +
      ".members.MemberCheckInOutRequest\032\024.membe" +
      "rs.MemberEvent\"\246\001\202\323\344\223\002\034\"\027/members/member" +
      "/checkIn:\001*\222A\200\001\n\007Members\022\017Check in membe" +
      "r\032dChecks in a member by either internal" +
      " PassKit ID or External ID. Returns the " +
      "latest 5 member events.\022\364\001\n\016checkOutMemb" +
      "er\022 .members.MemberCheckInOutRequest\032\024.m" +
      "embers.MemberEvent\"\251\001\202\323\344\223\002\035\"\030/members/me" +
      "mber/checkOut:\001*\222A\202\001\n\007Members\022\020Check out" +
      " member\032eChecks out a member by either i" +
      "nternal PassKit ID or External ID. Retur" +
      "ns the latest 5 member events.\022\204\002\n\025listM" +
      "embersDeprecated\022\036.members.ListRequestDe" +
      "precated\032\017.members.Member\"\267\001\202\323\344\223\002\"\022 /mem" +
      "bers/member/list/{programId}\222A\213\001\n\007Member" +
      "s\022\031List members [DEPRECATED]\032e[DEPRECATE" +
      "D: OR operator is not supported] List al" +
      "l members for a given segment. Supports " +
      "pagination.0\001\022\246\004\n\013listMembers\022\024.members." +
      "ListRequest\032\017.members.Member\"\355\003\202\323\344\223\002%\" /" +
      "members/member/list/{programId}:\001*\222A\276\003\n\007" +
      "Members\022\014List members\032\244\003List all members" +
      " for a given segment. Supports paginatio" +
      "n.\n\n<span style=\"font-weight:bold\">About" +
      " filter field names, operators and sampl" +
      "e payloads:</span> <a target=\"_blank\" hr" +
      "ef=\"https://help.passkit.com/en/articles" +
      "/4133757-membership-protocol-filtering-l" +
      "isting-and-counting-by-api#filter-member" +
      "s\">https://help.passkit.com/en/articles/" +
      "4133757-membership-protocol-filtering-li" +
      "sting-and-counting-by-api#filter-members" +
      "</a>0\001\022\233\001\n\014updateMember\022\017.members.Member" +
      "\032\006.io.Id\"r\202\323\344\223\002\024\032\017/members/member:\001*\222AU\n" +
      "\007Members\022\rUpdate member\032;Updates member " +
      "by either internal PassKit ID or Externa" +
      "l ID\022\346\001\n\nearnPoints\022\036.members.EarnBurnPo" +
      "intsRequest\032\025.members.MemberPoints\"\240\001\202\323\344" +
      "\223\002 \032\033/members/member/points/earn:\001*\222Aw\n\007" +
      "Members\022\013Earn points\032_Earns points for a" +
      " member (identified by PassKit ID or Ext" +
      "ernal ID). Adds the amounts provided.\022\350\001" +
      "\n\nburnPoints\022\036.members.EarnBurnPointsReq" +
      "uest\032\025.members.MemberPoints\"\242\001\202\323\344\223\002 \032\033/m" +
      "embers/member/points/burn:\001*\222Ay\n\007Members" +
      "\022\013Burn points\032aBurn points for a member " +
      "(identified by PassKit ID or External ID" +
      "). Deducts the amounts provided.\022\334\001\n\tset" +
      "Points\022\031.members.SetPointsRequest\032\025.memb" +
      "ers.MemberPoints\"\234\001\202\323\344\223\002\037\032\032/members/memb" +
      "er/points/set:\001*\222At\n\007Members\022\nSet points" +
      "\032]Set points for a member (identified by" +
      " PassKit ID or External ID). Sets the am" +
      "ounts provided.\022\266\001\n\026updateMembersBySegme" +
      "nt\022\035.members.MemberSegmentRequest\032\026.goog" +
      "le.protobuf.Empty\"e\202\323\344\223\002\034\032\027/members/memb" +
      "er/segment:\001*\222A@\n\007Members\022\031Update member" +
      "s by segment\032\032Updates members by segment" +
      "\022\266\001\n\026deleteMembersBySegment\022\035.members.Me" +
      "mberSegmentRequest\032\026.google.protobuf.Emp" +
      "ty\"e\202\323\344\223\002\034*\027/members/member/segment:\001*\222A" +
      "@\n\007Members\022\031Delete members by segment\032\032D" +
      "eletes members by segment\022\253\001\n\014deleteMemb" +
      "er\022\017.members.Member\032\026.google.protobuf.Em" +
      "pty\"r\202\323\344\223\002\024*\017/members/member:\001*\222AU\n\007Memb" +
      "ers\022\rDelete member\032;Deletes member by ei" +
      "ther internal PassKit ID or External ID\022" +
      "\261\002\n\026countMembersDeprecated\022\036.members.Lis" +
      "tRequestDeprecated\032\t.io.Count\"\353\001\202\323\344\223\002\034\022\032" +
      "/members/count/{programId}\222A\305\001\n\007Members\022" +
      "#Count Filtered Members [DEPRECATED]\032Q[D" +
      "EPRECATED: OR operator is not supported]" +
      " Retrieves a count of filtered members.J" +
      "\"\n\003403\022\033\n\031User lacks authorization.J\036\n\0034" +
      "04\022\027\n\025Record was not found.\022\323\004\n\014countMem" +
      "bers\022\024.members.ListRequest\032\t.io.Count\"\241\004" +
      "\202\323\344\223\002\037\"\032/members/count/{programId}:\001*\222A\370" +
      "\003\n\007Members\022\026Count Filtered Members\032\220\003Ret" +
      "rieves a count of filtered members.\n\n<sp" +
      "an style=\"font-weight:bold\">About filter" +
      " field names, operators and sample paylo" +
      "ads:</span> <a target=\"_blank\" href=\"htt" +
      "ps://help.passkit.com/en/articles/413375" +
      "7-membership-protocol-filtering-listing-" +
      "and-counting-by-api#filter-members\">http" +
      "s://help.passkit.com/en/articles/4133757" +
      "-membership-protocol-filtering-listing-a" +
      "nd-counting-by-api#filter-members</a>J\"\n" +
      "\003403\022\033\n\031User lacks authorization.J\036\n\003404" +
      "\022\027\n\025Record was not found.\022\322\001\n\032getMessage" +
      "HistoryForMember\022\016.io.Pagination\032\013.io.Me" +
      "ssage\"\224\001\202\323\344\223\002\032\022\030/members/member/messages" +
      "\222Aq\n\007Members\022\033Get members message histor" +
      "y\032IGet all the message that have been se" +
      "nt to a member. Supports pagination.0\001\022\332" +
      "\001\n\025getMetaKeysForProgram\022\006.io.Id\032\013.io.St" +
      "rings\"\253\001\202\323\344\223\002\033\022\031/members/member/meta/{id" +
      "}\222A\206\001\n\007Members\022\033Get Meta Keys for a Prog" +
      "ram\032^Returns a list of distinct meta fie" +
      "ld keys. Can be used for building filter" +
      "s / table headings.\022\263\002\n\022renewMembersExpi" +
      "ry\022\034.members.UpdateExpiryRequest\032\t.io.Co" +
      "unt\"\363\001\202\323\344\223\002\033\032\026/members/member/expiry:\001*\222" +
      "A\316\001\n\007Members\022\032Batch update member expiry" +
      "\032\246\001Batch updates expiry of ALL active me" +
      "mbers belong to the tier. Should only be" +
      " used when you want to update ALL the ex" +
      "piry date for all member records in a gi" +
      "ven tier.\022\242\001\n\022updateMemberExpiry\022\025.membe" +
      "rs.MemberExpiry\032\006.io.Id\"m\202\323\344\223\002!\032\034/member" +
      "s/member/updateExpiry:\001*\222AC\n\007Members\022\024Up" +
      "date member expiry\032\"Updates expiry of a " +
      "single member.\022\265\001\n\021countMemberEvents\022\024.m" +
      "embers.ListRequest\032\t.io.Count\"\177\202\323\344\223\002.\")/" +
      "members/program/count/events/{programId}" +
      ":\001*\222AH\n\010Programs\022\023Count member events\032\'C" +
      "ounts all members events for a program\022\275" +
      "\001\n\020listMemberEvents\022\024.members.ListReques" +
      "t\032\024.members.MemberEvent\"{\202\323\344\223\002-\"(/member" +
      "s/program/list/events/{programId}:\001*\222AE\n" +
      "\010Programs\022\022List member events\032%List all " +
      "members events for a program0\001\022\220\002\n getMe" +
      "mberEventMetaKeysForProgram\022\006.io.Id\032\013.io" +
      ".Strings\"\326\001\202\323\344\223\002\"\022 /members/member/event" +
      "s/meta/{id}\222A\252\001\n\010Programs\022(Get Member Ev" +
      "ent Meta Keys for a Program\032tReturns a l" +
      "ist of distinct meta field keys for the " +
      "member events. Can be used for building " +
      "filters / table headings.\022\250\001\n\023listEvents" +
      "ForMember\022\006.io.Id\032\024.members.MemberEvent\"" +
      "q\202\323\344\223\002%\" /members/member/list/events/{id" +
      "}:\001*\222AC\n\007Members\022\022List member events\032$Li" +
      "st all members events for a member0\001\022\314\001\n" +
      "\022deleteMemberEvents\022\024.members.ListReques" +
      "t\032\026.google.protobuf.Empty\"\207\001\202\323\344\223\002(*#/mem" +
      "bers/program/events/{programId}:\001*\222AV\n\010P" +
      "rograms\022\025Deletes member events\0323Deletes " +
      "all members events for a program and fil" +
      "ter\022\264\001\n\025deleteEventsForMember\022\006.io.Id\032\026." +
      "google.protobuf.Empty\"{\202\323\344\223\002 *\033/members/" +
      "member/events/{id}:\001*\222AR\n\007Members\022\037Delet" +
      "e member events for member\032&Delete all m" +
      "embers events for a member\022\262\001\n\021deleteMem" +
      "berEvent\022\006.io.Id\032\026.google.protobuf.Empty" +
      "\"}\202\323\344\223\002#*\036/members/member/events/id/{id}" +
      ":\001*\222AQ\n\007Members\022\"Deletes an individual m" +
      "ember event\032\"Deletes an individual membe" +
      "r event\022\352\001\n\023getProgramEnrolment\022\006.io.Id\032" +
      "\032.io.DataCollectionPageUrls\"\256\001\202\323\344\223\002!\022\037/m" +
      "embers/enrol/url/program/{id}\222A\203\001\n\016Enrol" +
      "ment Page\022\036Get Program Enrolment Page UR" +
      "L\032QRetrieves a enrolment page URL of the" +
      " base tier (the tier with the lowest ind" +
      "ex).B\301\006\n\030com.passkit.grpc.MembersZ,stash" +
      ".passkit.com/io/model/sdk/go/io/members\252" +
      "\002\tPKMembers\222A\351\005\022\206\002\n\023PassKit Members API\022" +
      "lThe PassKit Members API lets you manage" +
      " your membership programs and passes for" +
      " Apple Wallet and Google Pay.\0328https://p" +
      "asskit.com/legal/terms-of-subscription-s" +
      "ervice/\"?\n\017PassKit Support\022\027https://docs" +
      ".passkit.io\032\023support@passkit.com2\0061.0-rc" +
      "*\001\0022\020application/json:\020application/jsonR" +
      "9\n\003200\0222\n(Returned when the request is s" +
      "uccessful.\022\006\n\004\232\002\001\007RP\n\003403\022I\nGReturned wh" +
      "en the user does not have permission to " +
      "access the resource.R;\n\003404\0224\n*Returned " +
      "when the resource does not exist.\022\006\n\004\232\002\001" +
      "\007R<\n\003500\0225\n+Returned when there is an un" +
      "expected error.\022\006\n\004\232\002\001\007R]\n\003503\022V\nTReturn" +
      "ed when the user is being throttled. Bac" +
      "k off for a few ms and then try again.Z>" +
      "\n<\n\napiKeyAuth\022.\010\002\022\031JWT Authentication t" +
      "oken.\032\rAuthorization \002b\020\n\016\n\napiKeyAuth\022\000" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.Distribution.getDescriptor(),
          com.passkit.grpc.MessageOuterClass.getDescriptor(),
          com.passkit.grpc.PaginationOuterClass.getDescriptor(),
          com.passkit.grpc.Filter.getDescriptor(),
          com.passkit.grpc.Members.MemberEventsOuterClass.getDescriptor(),
          com.passkit.grpc.Members.MemberOuterClass.getDescriptor(),
          com.passkit.grpc.Members.ProgramOuterClass.getDescriptor(),
          com.passkit.grpc.Members.TierOuterClass.getDescriptor(),
          grpc.gateway.protoc_gen_swagger.options.Annotations.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Annotations.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_swagger.options.Annotations.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.passkit.grpc.CommonObjects.getDescriptor();
    com.passkit.grpc.Distribution.getDescriptor();
    com.passkit.grpc.MessageOuterClass.getDescriptor();
    com.passkit.grpc.PaginationOuterClass.getDescriptor();
    com.passkit.grpc.Filter.getDescriptor();
    com.passkit.grpc.Members.MemberEventsOuterClass.getDescriptor();
    com.passkit.grpc.Members.MemberOuterClass.getDescriptor();
    com.passkit.grpc.Members.ProgramOuterClass.getDescriptor();
    com.passkit.grpc.Members.TierOuterClass.getDescriptor();
    grpc.gateway.protoc_gen_swagger.options.Annotations.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
