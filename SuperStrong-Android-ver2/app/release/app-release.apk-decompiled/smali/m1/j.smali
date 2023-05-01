.class public final Lm1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/j$b;
    }
.end annotation


# instance fields
.field public final a:Le2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le2/g<",
            "Li1/f;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lf2/a$c;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le2/g;

    const-wide/16 v1, 0x3e8

    invoke-direct {v0, v1, v2}, Le2/g;-><init>(J)V

    iput-object v0, p0, Lm1/j;->a:Le2/g;

    new-instance v0, Lm1/j$a;

    invoke-direct {v0}, Lm1/j$a;-><init>()V

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lf2/a;->a(ILf2/a$b;)Lf2/a$c;

    move-result-object v0

    iput-object v0, p0, Lm1/j;->b:Lf2/a$c;

    return-void
.end method


# virtual methods
.method public final a(Li1/f;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lm1/j;->a:Le2/g;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lm1/j;->a:Le2/g;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Le2/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lm1/j;->b:Lf2/a$c;

    .line 16
    .line 17
    invoke-virtual {v0}, Lf2/a$c;->b()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroidx/activity/k;->h(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    check-cast v0, Lm1/j$b;

    .line 25
    .line 26
    :try_start_1
    iget-object v1, v0, Lm1/j$b;->b:Ljava/security/MessageDigest;

    .line 27
    .line 28
    invoke-interface {p1, v1}, Li1/f;->b(Ljava/security/MessageDigest;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lm1/j$b;->b:Ljava/security/MessageDigest;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sget-object v2, Le2/j;->b:[C

    .line 38
    .line 39
    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_0
    :try_start_2
    array-length v4, v1

    .line 42
    if-ge v3, v4, :cond_0

    .line 43
    .line 44
    aget-byte v4, v1, v3

    .line 45
    .line 46
    and-int/lit16 v4, v4, 0xff

    .line 47
    .line 48
    mul-int/lit8 v5, v3, 0x2

    .line 49
    .line 50
    ushr-int/lit8 v6, v4, 0x4

    .line 51
    .line 52
    sget-object v7, Le2/j;->a:[C

    .line 53
    .line 54
    aget-char v6, v7, v6

    .line 55
    .line 56
    aput-char v6, v2, v5

    .line 57
    .line 58
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    and-int/lit8 v4, v4, 0xf

    .line 61
    .line 62
    aget-char v4, v7, v4

    .line 63
    .line 64
    aput-char v4, v2, v5

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 72
    .line 73
    .line 74
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    iget-object v2, p0, Lm1/j;->b:Lf2/a$c;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lf2/a$c;->a(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    iget-object v1, p0, Lm1/j;->b:Lf2/a$c;

    .line 86
    .line 87
    invoke-virtual {v1, v0}, Lf2/a$c;->a(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_1
    :goto_1
    iget-object v2, p0, Lm1/j;->a:Le2/g;

    .line 92
    .line 93
    monitor-enter v2

    .line 94
    :try_start_5
    iget-object v0, p0, Lm1/j;->a:Le2/g;

    .line 95
    .line 96
    invoke-virtual {v0, p1, v1}, Le2/g;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    monitor-exit v2

    .line 100
    return-object v1

    .line 101
    :catchall_2
    move-exception p1

    .line 102
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 103
    throw p1

    .line 104
    :catchall_3
    move-exception p1

    .line 105
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 106
    throw p1
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
