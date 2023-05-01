.class public final Landroidx/lifecycle/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx0/d;)V
    .locals 7

    .line 1
    instance-of v0, p1, Landroidx/lifecycle/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/lifecycle/l0;

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/lifecycle/l0;->t()Landroidx/lifecycle/k0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Lx0/d;->b()Lx0/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v2, Ljava/util/HashSet;

    .line 20
    .line 21
    iget-object v3, v0, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v4, v0, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Landroidx/lifecycle/f0;

    .line 53
    .line 54
    invoke-interface {p1}, Landroidx/lifecycle/o;->v()Landroidx/lifecycle/p;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-string v5, "androidx.lifecycle.savedstate.vm.tag"

    .line 59
    .line 60
    iget-object v6, v3, Landroidx/lifecycle/f0;->a:Ljava/util/HashMap;

    .line 61
    .line 62
    if-nez v6, :cond_1

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    goto :goto_1

    .line 66
    :cond_1
    monitor-enter v6

    .line 67
    :try_start_0
    iget-object v3, v3, Landroidx/lifecycle/f0;->a:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :goto_1
    check-cast v3, Landroidx/lifecycle/SavedStateHandleController;

    .line 75
    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    iget-boolean v5, v3, Landroidx/lifecycle/SavedStateHandleController;->c:Z

    .line 79
    .line 80
    if-nez v5, :cond_0

    .line 81
    .line 82
    if-nez v5, :cond_2

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    iput-boolean v5, v3, Landroidx/lifecycle/SavedStateHandleController;->c:Z

    .line 86
    .line 87
    invoke-virtual {v4, v3}, Landroidx/lifecycle/p;->a(Landroidx/lifecycle/n;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, v3, Landroidx/lifecycle/SavedStateHandleController;->d:Landroidx/lifecycle/z;

    .line 91
    .line 92
    iget-object v5, v5, Landroidx/lifecycle/z;->e:Lx0/b$b;

    .line 93
    .line 94
    iget-object v3, v3, Landroidx/lifecycle/SavedStateHandleController;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v1, v3, v5}, Lx0/b;->c(Ljava/lang/String;Lx0/b$b;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v1}, Landroidx/lifecycle/i;->a(Landroidx/lifecycle/j;Lx0/b;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 104
    .line 105
    const-string v0, "Already attached to lifecycleOwner"

    .line 106
    .line 107
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    throw p1

    .line 114
    :cond_3
    new-instance p1, Ljava/util/HashSet;

    .line 115
    .line 116
    iget-object v0, v0, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-nez p1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v1}, Lx0/b;->d()V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void

    .line 135
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    .line 138
    .line 139
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
